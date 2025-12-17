package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Comments: ImageVector
    get() {
        if (_Comments != null) return _Comments!!
        
        _Comments = ImageVector.Builder(
            name = "comments",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 192f)
                curveToRelative(0f, -88.4f, -93.1f, -160f, -208f, -160f)
                reflectiveCurveTo(0f, 103.6f, 0f, 192f)
                curveToRelative(0f, 34.3f, 14.1f, 65.9f, 38f, 92f)
                curveToRelative(-13.4f, 30.2f, -35.5f, 54.2f, -35.8f, 54.5f)
                curveToRelative(-2.2f, 2.3f, -2.8f, 5.7f, -1.5f, 8.7f)
                reflectiveCurveTo(4.8f, 352f, 8f, 352f)
                curveToRelative(36.6f, 0f, 66.9f, -12.3f, 88.7f, -25f)
                curveToRelative(32.2f, 15.7f, 70.3f, 25f, 111.3f, 25f)
                curveToRelative(114.9f, 0f, 208f, -71.6f, 208f, -160f)
                close()
                moveToRelative(122f, 220f)
                curveToRelative(23.9f, -26f, 38f, -57.7f, 38f, -92f)
                curveToRelative(0f, -66.9f, -53.5f, -124.2f, -129.3f, -148.1f)
                curveToRelative(0.9f, 6.6f, 1.3f, 13.3f, 1.3f, 20.1f)
                curveToRelative(0f, 105.9f, -107.7f, 192f, -240f, 192f)
                curveToRelative(-10.8f, 0f, -21.3f, -0.8f, -31.7f, -1.9f)
                curveTo(207.8f, 439.6f, 281.8f, 480f, 368f, 480f)
                curveToRelative(41f, 0f, 79.1f, -9.2f, 111.3f, -25f)
                curveToRelative(21.8f, 12.7f, 52.1f, 25f, 88.7f, 25f)
                curveToRelative(3.2f, 0f, 6.1f, -1.9f, 7.3f, -4.8f)
                curveToRelative(1.3f, -2.9f, 0.7f, -6.3f, -1.5f, -8.7f)
                curveToRelative(-0.3f, -0.3f, -22.4f, -24.2f, -35.8f, -54.5f)
                close()
            }
        }.build()
        
        return _Comments!!
    }

private var _Comments: ImageVector? = null

