package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DropletOff: ImageVector
    get() {
        if (_DropletOff != null) return _DropletOff!!
        
        _DropletOff = ImageVector.Builder(
            name = "droplet-off",
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
                moveTo(18.963f, 14.938f)
                arcToRelative(6.54f, 6.54f, 0f, false, false, -0.899f, -4.06f)
                lineToRelative(-4.89f, -7.26f)
                curveToRelative(-0.42f, -0.626f, -1.287f, -0.804f, -1.936f, -0.398f)
                arcToRelative(1.376f, 1.376f, 0f, false, false, -0.41f, 0.397f)
                lineToRelative(-1.282f, 1.9f)
                moveToRelative(-1.625f, 2.415f)
                lineToRelative(-1.986f, 2.946f)
                curveToRelative(-1.695f, 2.837f, -1.035f, 6.44f, 1.567f, 8.545f)
                curveToRelative(2.602f, 2.105f, 6.395f, 2.105f, 8.996f, 0f)
                arcToRelative(6.83f, 6.83f, 0f, false, false, 1.376f, -1.499f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _DropletOff!!
    }

private var _DropletOff: ImageVector? = null

