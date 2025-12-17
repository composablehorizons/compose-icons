package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Auto_schedule: ImageVector
    get() {
        if (_Auto_schedule != null) return _Auto_schedule!!
        
        _Auto_schedule = ImageVector.Builder(
            name = "auto_schedule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 19f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(8f, 15f)
                lineToRelative(2.75f, -1.25f)
                lineTo(12f, 11f)
                lineToRelative(1.25f, 2.75f)
                lineTo(16f, 15f)
                lineToRelative(-2.75f, 1.25f)
                close()
                moveToRelative(-7f, 3f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 20.825f, 3f, 20f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.587f, -1.412f)
                quadTo(4.175f, 4f, 5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(21f, 5.175f, 21f, 6f)
                verticalLineToRelative(14f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(19.825f, 22f, 19f, 22f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(14f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Auto_schedule!!
    }

private var _Auto_schedule: ImageVector? = null

