package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AerialLift: ImageVector
    get() {
        if (_AerialLift != null) return _AerialLift!!
        
        _AerialLift = ImageVector.Builder(
            name = "aerial-lift",
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
                moveTo(4f, 5f)
                lineToRelative(16f, -2f)
                moveToRelative(-8f, 1f)
                verticalLineToRelative(10f)
                moveToRelative(-5.106f, -6f)
                horizontalLineToRelative(10.306f)
                curveToRelative(2.45f, 3f, 2.45f, 9f, -0.2f, 12f)
                horizontalLineToRelative(-10.106f)
                curveToRelative(-2.544f, -3f, -2.544f, -9f, 0f, -12f)
                close()
                moveToRelative(-1.894f, 6f)
                horizontalLineToRelative(14f)
            }
        }.build()
        
        return _AerialLift!!
    }

private var _AerialLift: ImageVector? = null

