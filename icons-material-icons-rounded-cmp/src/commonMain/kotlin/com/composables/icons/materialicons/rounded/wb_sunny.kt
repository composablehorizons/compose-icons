package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wb_sunny: ImageVector
    get() {
        if (_Wb_sunny != null) return _Wb_sunny!!
        
        _Wb_sunny = ImageVector.Builder(
            name = "wb_sunny",
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
                moveTo(6.05f, 4.14f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.38f, -1.4f, 0f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.4f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.39f, -0.38f, 0.39f, -1.02f, 0f, -1.4f)
                close()
                moveTo(3.01f, 10.5f)
                horizontalLineTo(1.99f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -0.99f, 0.99f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                horizontalLineTo(3f)
                curveToRelative(0.56f, 0.01f, 1f, -0.43f, 1f, -0.98f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.56f, -0.44f, -1f, -0.99f, -1f)
                close()
                moveToRelative(9f, -9.95f)
                horizontalLineTo(12f)
                curveToRelative(-0.56f, 0f, -1f, 0.44f, -1f, 0.99f)
                verticalLineToRelative(0.96f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                horizontalLineTo(12f)
                curveToRelative(0.56f, 0.01f, 1f, -0.43f, 1f, -0.98f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                close()
                moveToRelative(7.74f, 3.21f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, -0.01f)
                lineToRelative(-0.39f, 0.39f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.4f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.4f, 0f)
                lineToRelative(0.39f, -0.39f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0f, -1.4f)
                close()
                moveToRelative(-1.81f, 15.1f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.38f, -1.4f, 0f)
                curveToRelative(-0.4f, 0.4f, -0.4f, 1.02f, -0.01f, 1.41f)
                close()
                moveTo(20f, 11.49f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                horizontalLineTo(22f)
                curveToRelative(0.55f, 0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -0.99f, 0.99f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveToRelative(-0.01f, 16.95f)
                horizontalLineTo(12f)
                curveToRelative(0.55f, 0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.96f)
                curveToRelative(0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -0.99f, 0.99f)
                verticalLineToRelative(0.96f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                close()
                moveToRelative(-7.74f, -3.21f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.39f, -0.39f)
                curveToRelative(0.39f, -0.39f, 0.38f, -1.02f, 0f, -1.4f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-0.39f, 0.39f)
                curveToRelative(-0.38f, 0.4f, -0.38f, 1.02f, 0.01f, 1.41f)
                close()
            }
        }.build()
        
        return _Wb_sunny!!
    }

private var _Wb_sunny: ImageVector? = null

