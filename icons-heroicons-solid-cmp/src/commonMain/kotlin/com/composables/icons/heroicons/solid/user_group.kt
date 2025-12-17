package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.UserGroup: ImageVector
    get() {
        if (_UserGroup != null) return _UserGroup!!
        
        _UserGroup = ImageVector.Builder(
            name = "user-group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.25f, 6.75f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, 7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, -7.5f, 0f)
                close()
                moveTo(15.75f, 9.75f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                close()
                moveTo(2.25f, 9.75f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                close()
                moveTo(6.31f, 15.117f)
                arcTo(6.745f, 6.745f, 0f, false, true, 12f, 12f)
                arcToRelative(6.745f, 6.745f, 0f, false, true, 6.709f, 7.498f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.372f, 0.568f)
                arcTo(12.696f, 12.696f, 0f, false, true, 12f, 21.75f)
                curveToRelative(-2.305f, 0f, -4.47f, -0.612f, -6.337f, -1.684f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.372f, -0.568f)
                arcToRelative(6.787f, 6.787f, 0f, false, true, 1.019f, -4.38f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.082f, 14.254f)
                arcToRelative(8.287f, 8.287f, 0f, false, false, -1.308f, 5.135f)
                arcToRelative(9.687f, 9.687f, 0f, false, true, -1.764f, -0.44f)
                lineToRelative(-0.115f, -0.04f)
                arcToRelative(0.563f, 0.563f, 0f, false, true, -0.373f, -0.487f)
                lineToRelative(-0.01f, -0.121f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.57f, -4.047f)
                close()
                moveTo(20.226f, 19.389f)
                arcToRelative(8.287f, 8.287f, 0f, false, false, -1.308f, -5.135f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.57f, 4.047f)
                lineToRelative(-0.01f, 0.121f)
                arcToRelative(0.563f, 0.563f, 0f, false, true, -0.373f, 0.486f)
                lineToRelative(-0.115f, 0.04f)
                curveToRelative(-0.567f, 0.2f, -1.156f, 0.349f, -1.764f, 0.441f)
                close()
            }
        }.build()
        
        return _UserGroup!!
    }

private var _UserGroup: ImageVector? = null

