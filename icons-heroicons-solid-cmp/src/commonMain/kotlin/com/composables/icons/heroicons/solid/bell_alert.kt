package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BellAlert: ImageVector
    get() {
        if (_BellAlert != null) return _BellAlert!!
        
        _BellAlert = ImageVector.Builder(
            name = "bell-alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.85f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.117f, -1f)
                arcToRelative(9.719f, 9.719f, 0f, false, false, -2.348f, 4.876f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.479f, 0.248f)
                arcTo(8.219f, 8.219f, 0f, false, true, 5.85f, 3.5f)
                close()
                moveTo(19.267f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.118f, 1f)
                arcToRelative(8.22f, 8.22f, 0f, false, true, 1.987f, 4.124f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.48f, -0.248f)
                arcTo(9.72f, 9.72f, 0f, false, false, 19.266f, 2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                arcTo(6.75f, 6.75f, 0f, false, false, 5.25f, 9f)
                verticalLineToRelative(0.75f)
                arcToRelative(8.217f, 8.217f, 0f, false, true, -2.119f, 5.52f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.298f, 1.206f)
                curveToRelative(1.544f, 0.57f, 3.16f, 0.99f, 4.831f, 1.243f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 7.48f, 0f)
                arcToRelative(24.583f, 24.583f, 0f, false, false, 4.83f, -1.244f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.298f, -1.205f)
                arcToRelative(8.217f, 8.217f, 0f, false, true, -2.118f, -5.52f)
                verticalLineTo(9f)
                arcTo(6.75f, 6.75f, 0f, false, false, 12f, 2.25f)
                close()
                moveTo(9.75f, 18f)
                curveToRelative(0f, -0.034f, 0f, -0.067f, 0.002f, -0.1f)
                arcToRelative(25.05f, 25.05f, 0f, false, false, 4.496f, 0f)
                lineToRelative(0.002f, 0.1f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, -4.5f, 0f)
                close()
            }
        }.build()
        
        return _BellAlert!!
    }

private var _BellAlert: ImageVector? = null

