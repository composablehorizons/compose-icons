package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Dev: ImageVector
    get() {
        if (_Dev != null) return _Dev!!
        
        _Dev = ImageVector.Builder(
            name = "dev",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120.12f, 208.29f)
                curveToRelative(-3.88f, -2.9f, -7.77f, -4.35f, -11.65f, -4.35f)
                horizontalLineTo(91.03f)
                verticalLineToRelative(104.47f)
                horizontalLineToRelative(17.45f)
                curveToRelative(3.88f, 0f, 7.77f, -1.45f, 11.65f, -4.35f)
                curveToRelative(3.88f, -2.9f, 5.82f, -7.25f, 5.82f, -13.06f)
                verticalLineToRelative(-69.65f)
                curveToRelative(-0.01f, -5.8f, -1.96f, -10.16f, -5.83f, -13.06f)
                close()
                moveTo(404.1f, 32f)
                horizontalLineTo(43.9f)
                curveTo(19.7f, 32f, 0.06f, 51.59f, 0f, 75.8f)
                verticalLineToRelative(360.4f)
                curveTo(0.06f, 460.41f, 19.7f, 480f, 43.9f, 480f)
                horizontalLineToRelative(360.2f)
                curveToRelative(24.21f, 0f, 43.84f, -19.59f, 43.9f, -43.8f)
                verticalLineTo(75.8f)
                curveToRelative(-0.06f, -24.21f, -19.7f, -43.8f, -43.9f, -43.8f)
                close()
                moveTo(154.2f, 291.19f)
                curveToRelative(0f, 18.81f, -11.61f, 47.31f, -48.36f, 47.25f)
                horizontalLineToRelative(-46.4f)
                verticalLineTo(172.98f)
                horizontalLineToRelative(47.38f)
                curveToRelative(35.44f, 0f, 47.36f, 28.46f, 47.37f, 47.28f)
                lineToRelative(0.01f, 70.93f)
                close()
                moveToRelative(100.68f, -88.66f)
                horizontalLineTo(201.6f)
                verticalLineToRelative(38.42f)
                horizontalLineToRelative(32.57f)
                verticalLineToRelative(29.57f)
                horizontalLineTo(201.6f)
                verticalLineToRelative(38.41f)
                horizontalLineToRelative(53.29f)
                verticalLineToRelative(29.57f)
                horizontalLineToRelative(-62.18f)
                curveToRelative(-11.16f, 0.29f, -20.44f, -8.53f, -20.72f, -19.69f)
                verticalLineTo(193.7f)
                curveToRelative(-0.27f, -11.15f, 8.56f, -20.41f, 19.71f, -20.69f)
                horizontalLineToRelative(63.19f)
                lineToRelative(-0.01f, 29.52f)
                close()
                moveToRelative(103.64f, 115.29f)
                curveToRelative(-13.2f, 30.75f, -36.85f, 24.63f, -47.44f, 0f)
                lineToRelative(-38.53f, -144.8f)
                horizontalLineToRelative(32.57f)
                lineToRelative(29.71f, 113.72f)
                lineToRelative(29.57f, -113.72f)
                horizontalLineToRelative(32.58f)
                lineToRelative(-38.46f, 144.8f)
                close()
            }
        }.build()
        
        return _Dev!!
    }

private var _Dev: ImageVector? = null

