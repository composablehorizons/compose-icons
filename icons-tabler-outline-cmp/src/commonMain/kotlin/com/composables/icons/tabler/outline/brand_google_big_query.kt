package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGoogleBigQuery: ImageVector
    get() {
        if (_BrandGoogleBigQuery != null) return _BrandGoogleBigQuery!!
        
        _BrandGoogleBigQuery = ImageVector.Builder(
            name = "brand-google-big-query",
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
                moveTo(17.73f, 19.875f)
                arcToRelative(2.225f, 2.225f, 0f, false, true, -1.948f, 1.125f)
                horizontalLineToRelative(-7.283f)
                arcToRelative(2.222f, 2.222f, 0f, false, true, -1.947f, -1.158f)
                lineToRelative(-4.272f, -6.75f)
                arcToRelative(2.269f, 2.269f, 0f, false, true, 0f, -2.184f)
                lineToRelative(4.272f, -6.75f)
                arcToRelative(2.225f, 2.225f, 0f, false, true, 1.946f, -1.158f)
                horizontalLineToRelative(7.285f)
                curveToRelative(0.809f, 0f, 1.554f, 0.443f, 1.947f, 1.158f)
                lineToRelative(3.98f, 6.75f)
                arcToRelative(2.33f, 2.33f, 0f, false, true, 0f, 2.25f)
                lineToRelative(-3.98f, 6.75f)
                verticalLineToRelative(-0.033f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 11.5f)
                moveToRelative(-3.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 14f)
                lineToRelative(2f, 2f)
            }
        }.build()
        
        return _BrandGoogleBigQuery!!
    }

private var _BrandGoogleBigQuery: ImageVector? = null

