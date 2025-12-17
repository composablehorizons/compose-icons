package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Assembly: ImageVector
    get() {
        if (_Assembly != null) return _Assembly!!
        
        _Assembly = ImageVector.Builder(
            name = "assembly",
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
                moveTo(19.875f, 6.27f)
                curveToRelative(0.7f, 0.398f, 1.13f, 1.143f, 1.125f, 1.948f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 0.809f, -0.443f, 1.555f, -1.158f, 1.948f)
                lineToRelative(-6.75f, 4.27f)
                arcToRelative(2.27f, 2.27f, 0f, false, true, -2.184f, 0f)
                lineToRelative(-6.75f, -4.27f)
                arcToRelative(2.23f, 2.23f, 0f, false, true, -1.158f, -1.948f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0f, -0.809f, 0.443f, -1.554f, 1.158f, -1.947f)
                lineToRelative(6.75f, -3.98f)
                arcToRelative(2.33f, 2.33f, 0f, false, true, 2.25f, 0f)
                lineToRelative(6.75f, 3.98f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 9.422f)
                curveToRelative(0.312f, 0.18f, 0.503f, 0.515f, 0.5f, 0.876f)
                verticalLineToRelative(3.277f)
                curveToRelative(0f, 0.364f, -0.197f, 0.7f, -0.515f, 0.877f)
                lineToRelative(-3f, 1.922f)
                arcToRelative(1f, 1f, 0f, false, true, -0.97f, 0f)
                lineToRelative(-3f, -1.922f)
                arcToRelative(1f, 1f, 0f, false, true, -0.515f, -0.876f)
                verticalLineToRelative(-3.278f)
                curveToRelative(0f, -0.364f, 0.197f, -0.7f, 0.514f, -0.877f)
                lineToRelative(3f, -1.79f)
                curveToRelative(0.311f, -0.174f, 0.69f, -0.174f, 1f, 0f)
                lineToRelative(3f, 1.79f)
                horizontalLineToRelative(-0.014f)
                close()
            }
        }.build()
        
        return _Assembly!!
    }

private var _Assembly: ImageVector? = null

