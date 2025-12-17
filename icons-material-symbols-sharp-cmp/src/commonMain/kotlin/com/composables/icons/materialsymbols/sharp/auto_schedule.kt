package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Auto_schedule: ImageVector
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
                moveTo(3f, 22f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(18f)
                close()
                moveToRelative(2f, -2f)
                horizontalLineToRelative(14f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(6f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(7f, 11f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(8f, 15f)
                lineToRelative(2.75f, -1.25f)
                lineTo(12f, 11f)
                lineToRelative(1.25f, 2.75f)
                lineTo(16f, 15f)
                lineToRelative(-2.75f, 1.25f)
                close()
            }
        }.build()
        
        return _Auto_schedule!!
    }

private var _Auto_schedule: ImageVector? = null

