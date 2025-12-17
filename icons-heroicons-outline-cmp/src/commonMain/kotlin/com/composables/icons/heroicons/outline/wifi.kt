package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Wifi: ImageVector
    get() {
        if (_Wifi != null) return _Wifi!!
        
        _Wifi = ImageVector.Builder(
            name = "wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(8.288f, 15.038f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, 7.424f, 0f)
                moveTo(5.106f, 11.856f)
                curveToRelative(3.807f, -3.808f, 9.98f, -3.808f, 13.788f, 0f)
                moveTo(1.924f, 8.674f)
                curveToRelative(5.565f, -5.565f, 14.587f, -5.565f, 20.152f, 0f)
                moveTo(12.53f, 18.22f)
                lineToRelative(-0.53f, 0.53f)
                lineToRelative(-0.53f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _Wifi!!
    }

private var _Wifi: ImageVector? = null

