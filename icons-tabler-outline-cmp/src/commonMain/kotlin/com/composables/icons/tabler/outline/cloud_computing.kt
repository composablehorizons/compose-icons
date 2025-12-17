package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CloudComputing: ImageVector
    get() {
        if (_CloudComputing != null) return _CloudComputing!!
        
        _CloudComputing = ImageVector.Builder(
            name = "cloud-computing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.657f, 16f)
                curveToRelative(-2.572f, 0f, -4.657f, -2.007f, -4.657f, -4.483f)
                curveToRelative(0f, -2.475f, 2.085f, -4.482f, 4.657f, -4.482f)
                curveToRelative(0.393f, -1.762f, 1.794f, -3.2f, 3.675f, -3.773f)
                curveToRelative(1.88f, -0.572f, 3.956f, -0.193f, 5.444f, 1f)
                curveToRelative(1.488f, 1.19f, 2.162f, 3.007f, 1.77f, 4.769f)
                horizontalLineToRelative(0.99f)
                curveToRelative(1.913f, 0f, 3.464f, 1.56f, 3.464f, 3.486f)
                curveToRelative(0f, 1.927f, -1.551f, 3.487f, -3.465f, 3.487f)
                horizontalLineToRelative(-11.878f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
            }
        }.build()
        
        return _CloudComputing!!
    }

private var _CloudComputing: ImageVector? = null

