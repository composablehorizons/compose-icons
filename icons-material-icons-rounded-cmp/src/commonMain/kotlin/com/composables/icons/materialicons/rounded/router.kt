package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Router: ImageVector
    get() {
        if (_Router != null) return _Router!!
        
        _Router = ImageVector.Builder(
            name = "router",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.45f, 5.55f)
                curveToRelative(0.19f, 0.19f, 0.5f, 0.21f, 0.72f, 0.04f)
                curveTo(13.3f, 4.69f, 14.65f, 4.2f, 16f, 4.2f)
                reflectiveCurveToRelative(2.7f, 0.49f, 3.84f, 1.39f)
                curveToRelative(0.21f, 0.17f, 0.52f, 0.15f, 0.72f, -0.04f)
                lineToRelative(0.04f, -0.05f)
                curveToRelative(0.22f, -0.22f, 0.21f, -0.59f, -0.03f, -0.8f)
                curveTo(19.24f, 3.57f, 17.62f, 3f, 16f, 3f)
                reflectiveCurveToRelative(-3.24f, 0.57f, -4.57f, 1.7f)
                curveToRelative(-0.24f, 0.21f, -0.26f, 0.57f, -0.03f, 0.8f)
                lineToRelative(0.05f, 0.05f)
                close()
                moveToRelative(1.7f, 0.76f)
                curveToRelative(-0.25f, 0.2f, -0.26f, 0.58f, -0.04f, 0.8f)
                lineToRelative(0.04f, 0.04f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.72f, 0.04f)
                curveToRelative(0.63f, -0.48f, 1.38f, -0.69f, 2.13f, -0.69f)
                reflectiveCurveToRelative(1.5f, 0.21f, 2.13f, 0.68f)
                curveToRelative(0.22f, 0.17f, 0.53f, 0.16f, 0.72f, -0.04f)
                lineToRelative(0.04f, -0.04f)
                curveToRelative(0.23f, -0.23f, 0.21f, -0.6f, -0.04f, -0.8f)
                curveToRelative(-0.83f, -0.64f, -1.84f, -1f, -2.85f, -1f)
                reflectiveCurveToRelative(-2.02f, 0.36f, -2.85f, 1.01f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(8f, 18f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(3.5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(3.5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Router!!
    }

private var _Router: ImageVector? = null

