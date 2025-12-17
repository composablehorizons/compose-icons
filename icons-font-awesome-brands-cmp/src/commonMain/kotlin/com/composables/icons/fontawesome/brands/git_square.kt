package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GitSquare: ImageVector
    get() {
        if (_GitSquare != null) return _GitSquare!!
        
        _GitSquare = ImageVector.Builder(
            name = "git-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(100.59f, 334.24f)
                curveToRelative(48.57f, 3.31f, 58.95f, 2.11f, 58.95f, 11.94f)
                curveToRelative(0f, 20f, -65.55f, 20.06f, -65.55f, 1.52f)
                curveToRelative(0.01f, -5.09f, 3.29f, -9.4f, 6.6f, -13.46f)
                close()
                moveToRelative(27.95f, -116.64f)
                curveToRelative(-32.29f, 0f, -33.75f, 44.47f, -0.75f, 44.47f)
                curveToRelative(32.51f, 0f, 31.71f, -44.47f, 0.75f, -44.47f)
                close()
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                arcToRelative(48f, 48f, 0f, false, true, -48f, 48f)
                horizontalLineTo(48f)
                arcToRelative(48f, 48f, 0f, false, true, -48f, -48f)
                verticalLineTo(80f)
                arcToRelative(48f, 48f, 0f, false, true, 48f, -48f)
                horizontalLineToRelative(352f)
                arcToRelative(48f, 48f, 0f, false, true, 48f, 48f)
                close()
                moveToRelative(-227f, 69.31f)
                curveToRelative(0f, 14.49f, 8.38f, 22.88f, 22.86f, 22.88f)
                curveToRelative(14.74f, 0f, 23.13f, -8.39f, 23.13f, -22.88f)
                reflectiveCurveTo(258.62f, 127f, 243.88f, 127f)
                curveToRelative(-14.48f, 0f, -22.88f, 7.84f, -22.88f, 22.31f)
                close()
                moveTo(199.18f, 195f)
                horizontalLineToRelative(-49.55f)
                curveToRelative(-25f, -6.55f, -81.56f, -4.85f, -81.56f, 46.75f)
                curveToRelative(0f, 18.8f, 9.4f, 32f, 21.85f, 38.11f)
                curveTo(74.23f, 294.23f, 66.8f, 301f, 66.8f, 310.6f)
                curveToRelative(0f, 6.87f, 2.79f, 13.22f, 11.18f, 16.76f)
                curveToRelative(-8.9f, 8.4f, -14f, 14.48f, -14f, 25.92f)
                curveTo(64f, 373.35f, 81.53f, 385f, 127.52f, 385f)
                curveToRelative(44.22f, 0f, 69.87f, -16.51f, 69.87f, -45.73f)
                curveToRelative(0f, -36.67f, -28.23f, -35.32f, -94.77f, -39.38f)
                lineToRelative(8.38f, -13.43f)
                curveToRelative(17f, 4.74f, 74.19f, 6.23f, 74.19f, -42.43f)
                curveToRelative(0f, -11.69f, -4.83f, -19.82f, -9.4f, -25.67f)
                lineToRelative(23.38f, -1.78f)
                close()
                moveToRelative(84.34f, 109.84f)
                lineToRelative(-13f, -1.78f)
                curveToRelative(-3.82f, -0.51f, -4.07f, -1f, -4.07f, -5.09f)
                verticalLineTo(192.52f)
                horizontalLineToRelative(-52.6f)
                lineToRelative(-2.79f, 20.57f)
                curveToRelative(15.75f, 5.55f, 17f, 4.86f, 17f, 10.17f)
                verticalLineTo(298f)
                curveToRelative(0f, 5.62f, -0.31f, 4.58f, -17f, 6.87f)
                verticalLineToRelative(20.06f)
                horizontalLineToRelative(72.42f)
                close()
                moveTo(384f, 315f)
                lineToRelative(-6.87f, -22.37f)
                curveToRelative(-40.93f, 15.37f, -37.85f, -12.41f, -37.85f, -16.73f)
                verticalLineToRelative(-60.72f)
                horizontalLineToRelative(37.85f)
                verticalLineToRelative(-25.41f)
                horizontalLineToRelative(-35.82f)
                curveToRelative(-2.87f, 0f, -2f, 2.52f, -2f, -38.63f)
                horizontalLineToRelative(-24.18f)
                curveToRelative(-2.79f, 27.7f, -11.68f, 38.88f, -34f, 41.42f)
                verticalLineToRelative(22.62f)
                curveToRelative(20.47f, 0f, 19.82f, -0.85f, 19.82f, 2.54f)
                verticalLineToRelative(66.57f)
                curveToRelative(0f, 28.72f, 11.43f, 40.91f, 41.67f, 40.91f)
                curveToRelative(14.45f, 0f, 30.45f, -4.83f, 41.38f, -10.2f)
                close()
            }
        }.build()
        
        return _GitSquare!!
    }

private var _GitSquare: ImageVector? = null

