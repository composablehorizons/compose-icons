package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Gavel: ImageVector
    get() {
        if (_Gavel != null) return _Gavel!!
        
        _Gavel = ImageVector.Builder(
            name = "gavel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5.24f, 8.07f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(14.14f, 14.14f)
                lineToRelative(-2.83f, 2.83f)
                lineTo(5.24f, 8.07f)
                close()
                moveTo(12.32f, 1f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-5.66f, -5.66f)
                lineTo(12.32f, 1f)
                close()
                moveTo(3.83f, 9.48f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(-2.83f, 2.83f)
                lineTo(1f, 12.31f)
                lineToRelative(2.83f, -2.83f)
                close()
            }
        }.build()
        
        return _Gavel!!
    }

private var _Gavel: ImageVector? = null

