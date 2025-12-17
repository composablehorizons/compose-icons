package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BleachNoChlorine: ImageVector
    get() {
        if (_BleachNoChlorine != null) return _BleachNoChlorine!!
        
        _BleachNoChlorine = ImageVector.Builder(
            name = "bleach-no-chlorine",
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
                moveTo(5f, 19f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 1.84f, -2.75f)
                lineToRelative(-7.1f, -12.25f)
                arcToRelative(2f, 2f, 0f, false, false, -3.5f, 0f)
                lineToRelative(-7.1f, 12.25f)
                arcToRelative(2f, 2f, 0f, false, false, 1.75f, 2.75f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.576f, 19f)
                lineToRelative(7.907f, -13.733f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.719f, 19.014f)
                lineToRelative(5.346f, -9.284f)
            }
        }.build()
        
        return _BleachNoChlorine!!
    }

private var _BleachNoChlorine: ImageVector? = null

