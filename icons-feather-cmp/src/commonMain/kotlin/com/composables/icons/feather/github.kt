package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Github: ImageVector
    get() {
        if (_Github != null) return _Github!!
        
        _Github = ImageVector.Builder(
            name = "github",
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
                moveTo(9f, 19f)
                curveToRelative(-5f, 1.5f, -5f, -2.5f, -7f, -3f)
                moveToRelative(14f, 6f)
                verticalLineToRelative(-3.87f)
                arcToRelative(3.37f, 3.37f, 0f, false, false, -0.94f, -2.61f)
                curveToRelative(3.14f, -0.35f, 6.44f, -1.54f, 6.44f, -7f)
                arcTo(5.44f, 5.44f, 0f, false, false, 20f, 4.77f)
                arcTo(5.07f, 5.07f, 0f, false, false, 19.91f, 1f)
                reflectiveCurveTo(18.73f, 0.65f, 16f, 2.48f)
                arcToRelative(13.38f, 13.38f, 0f, false, false, -7f, 0f)
                curveTo(6.27f, 0.65f, 5.09f, 1f, 5.09f, 1f)
                arcTo(5.07f, 5.07f, 0f, false, false, 5f, 4.77f)
                arcToRelative(5.44f, 5.44f, 0f, false, false, -1.5f, 3.78f)
                curveToRelative(0f, 5.42f, 3.3f, 6.61f, 6.44f, 7f)
                arcTo(3.37f, 3.37f, 0f, false, false, 9f, 18.13f)
                verticalLineTo(22f)
            }
        }.build()
        
        return _Github!!
    }

private var _Github: ImageVector? = null

