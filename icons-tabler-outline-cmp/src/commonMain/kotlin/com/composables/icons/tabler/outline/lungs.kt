package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Lungs: ImageVector
    get() {
        if (_Lungs != null) return _Lungs!!
        
        _Lungs = ImageVector.Builder(
            name = "lungs",
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
                moveTo(6.081f, 20f)
                curveToRelative(1.612f, 0f, 2.919f, -1.335f, 2.919f, -2.98f)
                verticalLineToRelative(-9.763f)
                curveToRelative(0f, -0.694f, -0.552f, -1.257f, -1.232f, -1.257f)
                curveToRelative(-0.205f, 0f, -0.405f, 0.052f, -0.584f, 0.15f)
                lineToRelative(-0.13f, 0.083f)
                curveToRelative(-1.46f, 1.059f, -2.432f, 2.647f, -3.404f, 5.824f)
                curveToRelative(-0.42f, 1.37f, -0.636f, 2.962f, -0.648f, 4.775f)
                curveToRelative(-0.012f, 1.675f, 1.261f, 3.054f, 2.877f, 3.161f)
                lineToRelative(0.203f, 0.007f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.92f, 20f)
                curveToRelative(-1.613f, 0f, -2.92f, -1.335f, -2.92f, -2.98f)
                verticalLineToRelative(-9.763f)
                curveToRelative(0f, -0.694f, 0.552f, -1.257f, 1.233f, -1.257f)
                curveToRelative(0.204f, 0f, 0.405f, 0.052f, 0.584f, 0.15f)
                lineToRelative(0.13f, 0.083f)
                curveToRelative(1.46f, 1.059f, 2.432f, 2.647f, 3.405f, 5.824f)
                curveToRelative(0.42f, 1.37f, 0.636f, 2.962f, 0.648f, 4.775f)
                curveToRelative(0.012f, 1.675f, -1.261f, 3.054f, -2.878f, 3.161f)
                lineToRelative(-0.202f, 0.007f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                verticalLineToRelative(5f)
            }
        }.build()
        
        return _Lungs!!
    }

private var _Lungs: ImageVector? = null

