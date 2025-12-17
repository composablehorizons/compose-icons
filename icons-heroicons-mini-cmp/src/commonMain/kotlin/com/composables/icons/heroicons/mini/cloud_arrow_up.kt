package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CloudArrowUp: ImageVector
    get() {
        if (_CloudArrowUp != null) return _CloudArrowUp!!
        
        _CloudArrowUp = ImageVector.Builder(
            name = "cloud-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 17f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.44f, -8.765f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 8.302f, -3.046f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.504f, 4.272f)
                arcTo(4f, 4f, 0f, false, true, 15f, 17f)
                horizontalLineTo(5.5f)
                close()
                moveToRelative(3.75f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(9.66f)
                lineToRelative(1.95f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.1f, -1.02f)
                lineToRelative(-3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.1f, 0f)
                lineToRelative(-3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.1f, 1.02f)
                lineToRelative(1.95f, -2.1f)
                verticalLineToRelative(4.59f)
                close()
            }
        }.build()
        
        return _CloudArrowUp!!
    }

private var _CloudArrowUp: ImageVector? = null

