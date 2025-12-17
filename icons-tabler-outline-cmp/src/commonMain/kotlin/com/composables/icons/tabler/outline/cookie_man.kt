package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CookieMan: ImageVector
    get() {
        if (_CookieMan != null) return _CookieMan!!
        
        _CookieMan = ImageVector.Builder(
            name = "cookie-man",
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
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                arcToRelative(5f, 5f, 0f, false, true, 2.845f, 9.112f)
                lineToRelative(0.147f, 0.369f)
                lineToRelative(1.755f, -0.803f)
                curveToRelative(0.969f, -0.443f, 2.12f, -0.032f, 2.571f, 0.918f)
                arcToRelative(1.88f, 1.88f, 0f, false, true, -0.787f, 2.447f)
                lineToRelative(-0.148f, 0.076f)
                lineToRelative(-2.383f, 1.089f)
                verticalLineToRelative(2.02f)
                lineToRelative(1.426f, 1.425f)
                lineToRelative(0.114f, 0.125f)
                arcToRelative(1.96f, 1.96f, 0f, false, true, -2.762f, 2.762f)
                lineToRelative(-0.125f, -0.114f)
                lineToRelative(-2.079f, -2.08f)
                lineToRelative(-0.114f, -0.124f)
                arcToRelative(2f, 2f, 0f, false, true, -0.161f, -0.22f)
                horizontalLineToRelative(-0.599f)
                quadToRelative(-0.071f, 0.114f, -0.16f, 0.22f)
                lineToRelative(-0.115f, 0.125f)
                lineToRelative(-2.08f, 2.079f)
                arcToRelative(1.96f, 1.96f, 0f, false, true, -2.886f, -2.648f)
                lineToRelative(0.114f, -0.125f)
                lineToRelative(1.427f, -1.426f)
                verticalLineToRelative(-2.019f)
                lineToRelative(-2.383f, -1.09f)
                lineToRelative(-0.148f, -0.075f)
                arcToRelative(1.88f, 1.88f, 0f, false, true, -0.787f, -2.447f)
                curveToRelative(0.429f, -0.902f, 1.489f, -1.318f, 2.424f, -0.978f)
                lineToRelative(0.147f, 0.06f)
                lineToRelative(1.755f, 0.803f)
                lineToRelative(0.147f, -0.369f)
                arcToRelative(5f, 5f, 0f, false, true, -2.15f, -3.895f)
                verticalLineToRelative(-0.217f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 7f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _CookieMan!!
    }

private var _CookieMan: ImageVector? = null

