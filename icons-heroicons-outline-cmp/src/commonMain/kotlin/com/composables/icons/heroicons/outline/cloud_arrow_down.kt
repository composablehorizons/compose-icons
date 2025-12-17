package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CloudArrowDown: ImageVector
    get() {
        if (_CloudArrowDown != null) return _CloudArrowDown!!
        
        _CloudArrowDown = ImageVector.Builder(
            name = "cloud-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12f, 9.75f)
                verticalLineToRelative(6.75f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, -3f)
                moveToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                moveToRelative(-8.25f, 6f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.41f, -8.775f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, 10.233f, -2.33f)
                arcToRelative(3f, 3f, 0f, false, true, 3.758f, 3.848f)
                arcTo(3.752f, 3.752f, 0f, false, true, 18f, 19.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }.build()
        
        return _CloudArrowDown!!
    }

private var _CloudArrowDown: ImageVector? = null

