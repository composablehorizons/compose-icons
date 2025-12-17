package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CloudCheck: ImageVector
    get() {
        if (_CloudCheck != null) return _CloudCheck!!
        
        _CloudCheck = ImageVector.Builder(
            name = "cloud-check",
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
                moveTo(11f, 18.004f)
                horizontalLineToRelative(-4.343f)
                curveToRelative(-2.572f, -0.004f, -4.657f, -2.011f, -4.657f, -4.487f)
                curveToRelative(0f, -2.475f, 2.085f, -4.482f, 4.657f, -4.482f)
                curveToRelative(0.393f, -1.762f, 1.794f, -3.2f, 3.675f, -3.773f)
                curveToRelative(1.88f, -0.572f, 3.956f, -0.193f, 5.444f, 1f)
                curveToRelative(1.488f, 1.19f, 2.162f, 3.007f, 1.77f, 4.769f)
                horizontalLineToRelative(0.99f)
                curveToRelative(1.388f, 0f, 2.585f, 0.82f, 3.138f, 2.007f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _CloudCheck!!
    }

private var _CloudCheck: ImageVector? = null

