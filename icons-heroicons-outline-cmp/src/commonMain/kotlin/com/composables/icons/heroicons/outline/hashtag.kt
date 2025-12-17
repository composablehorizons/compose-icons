package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) return _Hashtag!!
        
        _Hashtag = ImageVector.Builder(
            name = "hashtag",
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
                moveTo(5.25f, 8.25f)
                horizontalLineToRelative(15f)
                moveToRelative(-16.5f, 7.5f)
                horizontalLineToRelative(15f)
                moveToRelative(-1.8f, -13.5f)
                lineToRelative(-3.9f, 19.5f)
                moveToRelative(-2.1f, -19.5f)
                lineToRelative(-3.9f, 19.5f)
            }
        }.build()
        
        return _Hashtag!!
    }

private var _Hashtag: ImageVector? = null

