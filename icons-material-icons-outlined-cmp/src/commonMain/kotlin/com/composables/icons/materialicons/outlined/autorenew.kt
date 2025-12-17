package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Autorenew: ImageVector
    get() {
        if (_Autorenew != null) return _Autorenew!!
        
        _Autorenew = ImageVector.Builder(
            name = "autorenew",
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
                moveTo(12f, 6f)
                verticalLineToRelative(3f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(3f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 1.57f, 0.46f, 3.03f, 1.24f, 4.26f)
                lineTo(6.7f, 14.8f)
                curveToRelative(-0.45f, -0.83f, -0.7f, -1.79f, -0.7f, -2.8f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                close()
                moveToRelative(6.76f, 1.74f)
                lineTo(17.3f, 9.2f)
                curveToRelative(0.44f, 0.84f, 0.7f, 1.79f, 0.7f, 2.8f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                verticalLineToRelative(-3f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-3f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                curveToRelative(0f, -1.57f, -0.46f, -3.03f, -1.24f, -4.26f)
                close()
            }
        }.build()
        
        return _Autorenew!!
    }

private var _Autorenew: ImageVector? = null

