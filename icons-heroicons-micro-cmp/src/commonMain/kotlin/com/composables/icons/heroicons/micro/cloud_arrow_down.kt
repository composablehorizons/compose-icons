package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CloudArrowDown: ImageVector
    get() {
        if (_CloudArrowDown != null) return _CloudArrowDown!!
        
        _CloudArrowDown = ImageVector.Builder(
            name = "cloud-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 13f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -1.41f, -6.705f)
                arcTo(3.5f, 3.5f, 0f, false, true, 9.72f, 4.124f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.197f, 3.018f)
                arcTo(3.001f, 3.001f, 0f, false, true, 12f, 13f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(6.28f, -3.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-0.97f, 0.97f)
                verticalLineTo(6.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.69f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(2.25f, -2.25f)
                close()
            }
        }.build()
        
        return _CloudArrowDown!!
    }

private var _CloudArrowDown: ImageVector? = null

