package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Edge: ImageVector
    get() {
        if (_Edge != null) return _Edge!!
        
        _Edge = ImageVector.Builder(
            name = "edge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481.92f, 134.48f)
                curveTo(440.87f, 54.18f, 352.26f, 8f, 255.91f, 8f)
                curveTo(137.05f, 8f, 37.51f, 91.68f, 13.47f, 203.66f)
                curveToRelative(26f, -46.49f, 86.22f, -79.14f, 149.46f, -79.14f)
                curveToRelative(79.27f, 0f, 121.09f, 48.93f, 122.25f, 50.18f)
                curveToRelative(22f, 23.8f, 33f, 50.39f, 33f, 83.1f)
                curveToRelative(0f, 10.4f, -5.31f, 25.82f, -15.11f, 38.57f)
                curveToRelative(-1.57f, 2f, -6.39f, 4.84f, -6.39f, 11f)
                curveToRelative(0f, 5.06f, 3.29f, 9.92f, 9.14f, 14f)
                curveToRelative(27.86f, 19.37f, 80.37f, 16.81f, 80.51f, 16.81f)
                arcTo(115.39f, 115.39f, 0f, false, false, 444.94f, 322f)
                arcToRelative(118.92f, 118.92f, 0f, false, false, 58.95f, -102.44f)
                curveTo(504.39f, 176.13f, 488.39f, 147.26f, 481.92f, 134.48f)
                close()
                moveTo(212.77f, 475.67f)
                arcToRelative(154.88f, 154.88f, 0f, false, true, -46.64f, -45f)
                curveToRelative(-32.94f, -47.42f, -34.24f, -95.6f, -20.1f, -136f)
                arcTo(155.5f, 155.5f, 0f, false, true, 203f, 215.75f)
                curveToRelative(59f, -45.2f, 94.84f, -5.65f, 99.06f, -1f)
                arcToRelative(80f, 80f, 0f, false, false, -4.89f, -10.14f)
                curveToRelative(-9.24f, -15.93f, -24f, -36.41f, -56.56f, -53.51f)
                curveToRelative(-33.72f, -17.69f, -70.59f, -18.59f, -77.64f, -18.59f)
                curveToRelative(-38.71f, 0f, -77.9f, 13f, -107.53f, 35.69f)
                curveTo(35.68f, 183.3f, 12.77f, 208.72f, 8.6f, 243f)
                curveToRelative(-1.08f, 12.31f, -2.75f, 62.8f, 23f, 118.27f)
                arcToRelative(248f, 248f, 0f, false, false, 248.3f, 141.61f)
                curveTo(241.78f, 496.26f, 214.05f, 476.24f, 212.77f, 475.67f)
                close()
                moveToRelative(250.72f, -98.33f)
                arcToRelative(7.76f, 7.76f, 0f, false, false, -7.92f, -0.23f)
                arcToRelative(181.66f, 181.66f, 0f, false, true, -20.41f, 9.12f)
                arcToRelative(197.54f, 197.54f, 0f, false, true, -69.55f, 12.52f)
                curveToRelative(-91.67f, 0f, -171.52f, -63.06f, -171.52f, -144f)
                arcTo(61.12f, 61.12f, 0f, false, true, 200.61f, 228f)
                arcTo(168.72f, 168.72f, 0f, false, false, 161.85f, 278f)
                curveToRelative(-14.92f, 29.37f, -33f, 88.13f, 13.33f, 151.66f)
                curveToRelative(6.51f, 8.91f, 23f, 30f, 56f, 47.67f)
                curveToRelative(23.57f, 12.65f, 49f, 19.61f, 71.7f, 19.61f)
                curveToRelative(35.14f, 0f, 115.43f, -33.44f, 163f, -108.87f)
                arcTo(7.75f, 7.75f, 0f, false, false, 463.49f, 377.34f)
                close()
            }
        }.build()
        
        return _Edge!!
    }

private var _Edge: ImageVector? = null

