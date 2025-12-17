package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) return _Hashtag!!
        
        _Hashtag = ImageVector.Builder(
            name = "hashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.487f, 2.89f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.474f, -0.28f)
                lineToRelative(-0.455f, 2.388f)
                horizontalLineTo(3.61f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.663f)
                lineToRelative(-0.571f, 2.998f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.666f)
                lineToRelative(-0.403f, 2.114f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.474f, 0.28f)
                lineToRelative(0.456f, -2.394f)
                horizontalLineToRelative(2.973f)
                lineToRelative(-0.403f, 2.114f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.474f, 0.28f)
                lineToRelative(0.456f, -2.394f)
                horizontalLineToRelative(1.947f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.661f)
                lineToRelative(0.57f, -2.998f)
                horizontalLineToRelative(1.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.664f)
                lineToRelative(0.402f, -2.108f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.474f, -0.28f)
                lineToRelative(-0.455f, 2.388f)
                horizontalLineTo(7.085f)
                lineToRelative(0.402f, -2.108f)
                close()
                moveTo(6.8f, 6.498f)
                lineToRelative(-0.571f, 2.998f)
                horizontalLineToRelative(2.973f)
                lineToRelative(0.57f, -2.998f)
                horizontalLineTo(6.8f)
                close()
            }
        }.build()
        
        return _Hashtag!!
    }

private var _Hashtag: ImageVector? = null

