package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.UserGroup: ImageVector
    get() {
        if (_UserGroup != null) return _UserGroup!!
        
        _UserGroup = ImageVector.Builder(
            name = "user-group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 9f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
                moveTo(6f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
                moveTo(1.49f, 15.326f)
                arcToRelative(0.78f, 0.78f, 0f, false, true, -0.358f, -0.442f)
                arcToRelative(3f, 3f, 0f, false, true, 4.308f, -3.516f)
                arcToRelative(6.484f, 6.484f, 0f, false, false, -1.905f, 3.959f)
                curveToRelative(-0.023f, 0.222f, -0.014f, 0.442f, 0.025f, 0.654f)
                arcToRelative(4.97f, 4.97f, 0f, false, true, -2.07f, -0.655f)
                close()
                moveTo(16.44f, 15.98f)
                arcToRelative(4.97f, 4.97f, 0f, false, false, 2.07f, -0.654f)
                arcToRelative(0.78f, 0.78f, 0f, false, false, 0.357f, -0.442f)
                arcToRelative(3f, 3f, 0f, false, false, -4.308f, -3.517f)
                arcToRelative(6.484f, 6.484f, 0f, false, true, 1.907f, 3.96f)
                arcToRelative(2.32f, 2.32f, 0f, false, true, -0.026f, 0.654f)
                close()
                moveTo(18f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
                moveTo(5.304f, 16.19f)
                arcToRelative(0.844f, 0.844f, 0f, false, true, -0.277f, -0.71f)
                arcToRelative(5f, 5f, 0f, false, true, 9.947f, 0f)
                arcToRelative(0.843f, 0.843f, 0f, false, true, -0.277f, 0.71f)
                arcTo(6.975f, 6.975f, 0f, false, true, 10f, 18f)
                arcToRelative(6.974f, 6.974f, 0f, false, true, -4.696f, -1.81f)
                close()
            }
        }.build()
        
        return _UserGroup!!
    }

private var _UserGroup: ImageVector? = null

