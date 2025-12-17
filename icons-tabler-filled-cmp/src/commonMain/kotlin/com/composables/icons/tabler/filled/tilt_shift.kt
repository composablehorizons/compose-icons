package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TiltShift: ImageVector
    get() {
        if (_TiltShift != null) return _TiltShift!!
        
        _TiltShift = ImageVector.Builder(
            name = "tilt-shift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.178f, 2.766f)
                arcToRelative(1f, 1f, 0f, true, true, 0.764f, 1.848f)
                arcToRelative(8f, 8f, 0f, false, false, -2.595f, 1.733f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, -1.414f)
                arcToRelative(10f, 10f, 0f, false, true, 3.245f, -2.167f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.767f, 8.176f)
                arcToRelative(1f, 1f, 0f, true, true, 1.846f, 0.768f)
                arcToRelative(8f, 8f, 0f, false, false, -0.613f, 3.058f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, -0.004f)
                arcToRelative(10f, 10f, 0f, false, true, 0.767f, -3.822f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.308f, 14.516f)
                arcToRelative(1f, 1f, 0f, false, true, 1.306f, 0.542f)
                arcToRelative(8f, 8f, 0f, false, false, 1.733f, 2.595f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, 1.414f)
                arcToRelative(10f, 10f, 0f, false, true, -2.167f, -3.245f)
                arcToRelative(1f, 1f, 0f, false, true, 0.542f, -1.306f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.637f, 19.926f)
                arcToRelative(1f, 1f, 0f, false, true, 1.307f, -0.54f)
                arcToRelative(8f, 8f, 0f, false, false, 3.058f, 0.614f)
                arcToRelative(1f, 1f, 0f, false, true, -0.004f, 2f)
                arcToRelative(10f, 10f, 0f, false, true, -3.822f, -0.767f)
                arcToRelative(1f, 1f, 0f, false, true, -0.54f, -1.307f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.653f, 17.653f)
                arcToRelative(1f, 1f, 0f, true, true, 1.414f, 1.414f)
                arcToRelative(10f, 10f, 0f, false, true, -3.245f, 2.167f)
                arcToRelative(1f, 1f, 0f, true, true, -0.764f, -1.848f)
                arcToRelative(8f, 8f, 0f, false, false, 2.595f, -1.733f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.002f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 0.998f, 1.002f)
                arcToRelative(10f, 10f, 0f, false, true, -0.767f, 3.822f)
                arcToRelative(1f, 1f, 0f, true, true, -1.846f, -0.768f)
                arcToRelative(8f, 8f, 0f, false, false, 0.613f, -3.058f)
                arcToRelative(1f, 1f, 0f, false, true, 1.002f, -0.998f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.653f, 4.933f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                arcToRelative(10f, 10f, 0f, false, true, 2.167f, 3.245f)
                arcToRelative(1f, 1f, 0f, true, true, -1.848f, 0.764f)
                arcToRelative(8f, 8f, 0f, false, false, -1.733f, -2.595f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.002f, 2f)
                arcToRelative(10f, 10f, 0f, false, true, 3.822f, 0.767f)
                arcToRelative(1f, 1f, 0f, true, true, -0.768f, 1.846f)
                arcToRelative(8f, 8f, 0f, false, false, -3.058f, -0.613f)
                arcToRelative(1f, 1f, 0f, false, true, 0.004f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 9f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
            }
        }.build()
        
        return _TiltShift!!
    }

private var _TiltShift: ImageVector? = null

