package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Autorenew: ImageVector
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
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f)
                verticalLineTo(4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 1.04f, 0.2f, 2.04f, 0.57f, 2.95f)
                curveToRelative(0.27f, 0.67f, 1.13f, 0.85f, 1.64f, 0.34f)
                curveToRelative(0.27f, -0.27f, 0.38f, -0.68f, 0.23f, -1.04f)
                curveTo(6.15f, 13.56f, 6f, 12.79f, 6f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                close()
                moveToRelative(5.79f, 2.71f)
                curveToRelative(-0.27f, 0.27f, -0.38f, 0.69f, -0.23f, 1.04f)
                curveToRelative(0.28f, 0.7f, 0.44f, 1.46f, 0.44f, 2.25f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                verticalLineToRelative(-1.79f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f)
                verticalLineTo(20f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                curveToRelative(0f, -1.04f, -0.2f, -2.04f, -0.57f, -2.95f)
                curveToRelative(-0.27f, -0.67f, -1.13f, -0.85f, -1.64f, -0.34f)
                close()
            }
        }.build()
        
        return _Autorenew!!
    }

private var _Autorenew: ImageVector? = null

