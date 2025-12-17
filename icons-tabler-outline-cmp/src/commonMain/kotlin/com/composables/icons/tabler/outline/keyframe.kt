package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Keyframe: ImageVector
    get() {
        if (_Keyframe != null) return _Keyframe!!
        
        _Keyframe = ImageVector.Builder(
            name = "keyframe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.225f, 18.412f)
                arcToRelative(1.595f, 1.595f, 0f, false, true, -1.225f, 0.588f)
                curveToRelative(-0.468f, 0f, -0.914f, -0.214f, -1.225f, -0.588f)
                lineToRelative(-4.361f, -5.248f)
                arcToRelative(1.844f, 1.844f, 0f, false, true, 0f, -2.328f)
                lineToRelative(4.361f, -5.248f)
                arcToRelative(1.595f, 1.595f, 0f, false, true, 1.225f, -0.588f)
                curveToRelative(0.468f, 0f, 0.914f, 0.214f, 1.225f, 0.588f)
                lineToRelative(4.361f, 5.248f)
                arcToRelative(1.844f, 1.844f, 0f, false, true, 0f, 2.328f)
                lineToRelative(-4.361f, 5.248f)
                close()
            }
        }.build()
        
        return _Keyframe!!
    }

private var _Keyframe: ImageVector? = null

