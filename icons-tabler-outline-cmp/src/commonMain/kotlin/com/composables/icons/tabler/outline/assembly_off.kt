package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AssemblyOff: ImageVector
    get() {
        if (_AssemblyOff != null) return _AssemblyOff!!
        
        _AssemblyOff = ImageVector.Builder(
            name = "assembly-off",
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
                moveTo(18.376f, 18.377f)
                lineToRelative(-5.284f, 3.343f)
                arcToRelative(2.27f, 2.27f, 0f, false, true, -2.184f, 0f)
                lineToRelative(-6.75f, -4.27f)
                arcToRelative(2.23f, 2.23f, 0f, false, true, -1.158f, -1.948f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0f, -0.809f, 0.443f, -1.554f, 1.158f, -1.947f)
                lineToRelative(1.328f, -0.783f)
                moveToRelative(2.514f, -1.487f)
                lineToRelative(2.908f, -1.71f)
                arcToRelative(2.33f, 2.33f, 0f, false, true, 2.25f, 0f)
                lineToRelative(6.75f, 3.98f)
                horizontalLineToRelative(-0.033f)
                curveToRelative(0.7f, 0.398f, 1.13f, 1.143f, 1.125f, 1.948f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 0.417f, -0.118f, 0.817f, -0.33f, 1.16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.855f, 14.855f)
                lineToRelative(-2.37f, 1.519f)
                arcToRelative(1f, 1f, 0f, false, true, -0.97f, 0f)
                lineToRelative(-3f, -1.922f)
                arcToRelative(1f, 1f, 0f, false, true, -0.515f, -0.876f)
                verticalLineToRelative(-3.278f)
                curveToRelative(0f, -0.364f, 0.197f, -0.7f, 0.514f, -0.877f)
                lineToRelative(0.563f, -0.336f)
                moveToRelative(2.437f, -1.454f)
                arcToRelative(1.03f, 1.03f, 0f, false, true, 1f, 0f)
                lineToRelative(3f, 1.79f)
                horizontalLineToRelative(-0.014f)
                curveToRelative(0.312f, 0.181f, 0.503f, 0.516f, 0.5f, 0.877f)
                verticalLineToRelative(1.702f)
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
        
        return _AssemblyOff!!
    }

private var _AssemblyOff: ImageVector? = null

