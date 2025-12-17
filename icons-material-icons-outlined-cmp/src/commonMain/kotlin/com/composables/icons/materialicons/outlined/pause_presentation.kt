package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pause_presentation: ImageVector
    get() {
        if (_Pause_presentation != null) return _Pause_presentation!!
        
        _Pause_presentation = ImageVector.Builder(
            name = "pause_presentation",
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
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.85f, -2f, 1.95f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2.05f, 2f, 2.05f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.95f, 2f, -2.05f)
                verticalLineToRelative(-14f)
                curveTo(23f, 3.85f, 22.1f, 3f, 21f, 3f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineTo(9f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Pause_presentation!!
    }

private var _Pause_presentation: ImageVector? = null

