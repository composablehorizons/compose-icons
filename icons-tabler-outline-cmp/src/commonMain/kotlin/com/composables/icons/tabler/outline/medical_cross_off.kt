package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MedicalCrossOff: ImageVector
    get() {
        if (_MedicalCrossOff != null) return _MedicalCrossOff!!
        
        _MedicalCrossOff = ImageVector.Builder(
            name = "medical-cross-off",
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
                moveTo(17.928f, 17.733f)
                lineToRelative(-0.574f, -0.331f)
                lineToRelative(-3.354f, -1.938f)
                verticalLineToRelative(4.536f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4.536f)
                lineToRelative(-3.928f, 2.268f)
                arcToRelative(1f, 1f, 0f, false, true, -1.366f, -0.366f)
                lineToRelative(-1f, -1.732f)
                arcToRelative(1f, 1f, 0f, false, true, 0.366f, -1.366f)
                lineToRelative(3.927f, -2.268f)
                lineToRelative(-3.927f, -2.268f)
                arcToRelative(1f, 1f, 0f, false, true, -0.366f, -1.366f)
                lineToRelative(1f, -1.732f)
                arcToRelative(1f, 1f, 0f, false, true, 1.366f, -0.366f)
                lineToRelative(0.333f, 0.192f)
                moveToRelative(3.595f, -0.46f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4.535f)
                lineToRelative(3.928f, -2.267f)
                arcToRelative(1f, 1f, 0f, false, true, 1.366f, 0.366f)
                lineToRelative(1f, 1.732f)
                arcToRelative(1f, 1f, 0f, false, true, -0.366f, 1.366f)
                lineToRelative(-3.927f, 2.268f)
                lineToRelative(3.927f, 2.269f)
                arcToRelative(1f, 1f, 0f, false, true, 0.366f, 1.366f)
                lineToRelative(-0.24f, 0.416f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _MedicalCrossOff!!
    }

private var _MedicalCrossOff: ImageVector? = null

