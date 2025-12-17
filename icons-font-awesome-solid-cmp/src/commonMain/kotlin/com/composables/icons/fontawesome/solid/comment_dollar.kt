package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CommentDollar: ImageVector
    get() {
        if (_CommentDollar != null) return _CommentDollar!!
        
        _CommentDollar = ImageVector.Builder(
            name = "comment-dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 32f)
                curveTo(114.62f, 32f, 0f, 125.12f, 0f, 240f)
                curveToRelative(0f, 49.56f, 21.41f, 95.01f, 57.02f, 130.74f)
                curveTo(44.46f, 421.05f, 2.7f, 465.97f, 2.2f, 466.5f)
                arcTo(7.995f, 7.995f, 0f, false, false, 8f, 480f)
                curveToRelative(66.26f, 0f, 115.99f, -31.75f, 140.6f, -51.38f)
                curveTo(181.29f, 440.93f, 217.59f, 448f, 256f, 448f)
                curveToRelative(141.38f, 0f, 256f, -93.12f, 256f, -208f)
                reflectiveCurveTo(397.38f, 32f, 256f, 32f)
                close()
                moveToRelative(24f, 302.44f)
                verticalLineTo(352f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-16f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-17.73f)
                curveToRelative(-11.42f, -1.35f, -22.28f, -5.19f, -31.78f, -11.46f)
                curveToRelative(-6.22f, -4.11f, -6.82f, -13.11f, -1.55f, -18.38f)
                lineToRelative(17.52f, -17.52f)
                curveToRelative(3.74f, -3.74f, 9.31f, -4.24f, 14.11f, -2.03f)
                curveToRelative(3.18f, 1.46f, 6.66f, 2.22f, 10.26f, 2.22f)
                horizontalLineToRelative(32.78f)
                curveToRelative(4.66f, 0f, 8.44f, -3.78f, 8.44f, -8.42f)
                curveToRelative(0f, -3.75f, -2.52f, -7.08f, -6.12f, -8.11f)
                lineToRelative(-50.07f, -14.3f)
                curveToRelative(-22.25f, -6.35f, -40.01f, -24.71f, -42.91f, -47.67f)
                curveToRelative(-4.05f, -32.07f, 19.03f, -59.43f, 49.32f, -63.05f)
                verticalLineTo(128f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(17.73f)
                curveToRelative(11.42f, 1.35f, 22.28f, 5.19f, 31.78f, 11.46f)
                curveToRelative(6.22f, 4.11f, 6.82f, 13.11f, 1.55f, 18.38f)
                lineToRelative(-17.52f, 17.52f)
                curveToRelative(-3.74f, 3.74f, -9.31f, 4.24f, -14.11f, 2.03f)
                arcToRelative(24.516f, 24.516f, 0f, false, false, -10.26f, -2.22f)
                horizontalLineToRelative(-32.78f)
                curveToRelative(-4.66f, 0f, -8.44f, 3.78f, -8.44f, 8.42f)
                curveToRelative(0f, 3.75f, 2.52f, 7.08f, 6.12f, 8.11f)
                lineToRelative(50.07f, 14.3f)
                curveToRelative(22.25f, 6.36f, 40.01f, 24.71f, 42.91f, 47.67f)
                curveToRelative(4.05f, 32.06f, -19.03f, 59.42f, -49.32f, 63.04f)
                close()
            }
        }.build()
        
        return _CommentDollar!!
    }

private var _CommentDollar: ImageVector? = null

