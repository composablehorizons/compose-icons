package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.OctagonAlert: ImageVector
    get() {
        if (_OctagonAlert != null) return _OctagonAlert!!
        
        _OctagonAlert = ImageVector.Builder(
            name = "octagon-alert",
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
                moveTo(12f, 16f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.312f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineToRelative(4.688f, 4.688f)
                arcTo(2f, 2f, 0f, false, true, 22f, 8.688f)
                verticalLineToRelative(6.624f)
                arcToRelative(2f, 2f, 0f, false, true, -0.586f, 1.414f)
                lineToRelative(-4.688f, 4.688f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, 0.586f)
                horizontalLineTo(8.688f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-4.688f, -4.688f)
                arcTo(2f, 2f, 0f, false, true, 2f, 15.312f)
                verticalLineTo(8.688f)
                arcToRelative(2f, 2f, 0f, false, true, 0.586f, -1.414f)
                lineToRelative(4.688f, -4.688f)
                arcTo(2f, 2f, 0f, false, true, 8.688f, 2f)
                close()
            }
        }.build()
        
        return _OctagonAlert!!
    }

private var _OctagonAlert: ImageVector? = null

