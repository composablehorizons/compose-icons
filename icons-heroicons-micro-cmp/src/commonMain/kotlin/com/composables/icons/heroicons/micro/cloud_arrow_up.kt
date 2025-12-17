package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CloudArrowUp: ImageVector
    get() {
        if (_CloudArrowUp != null) return _CloudArrowUp!!
        
        _CloudArrowUp = ImageVector.Builder(
            name = "cloud-arrow-up",
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
                moveToRelative(0.72f, -5.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(0.97f, -0.97f)
                verticalLineToRelative(2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(8.06f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(8.53f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineTo(5.22f, 7.97f)
                close()
            }
        }.build()
        
        return _CloudArrowUp!!
    }

private var _CloudArrowUp: ImageVector? = null

