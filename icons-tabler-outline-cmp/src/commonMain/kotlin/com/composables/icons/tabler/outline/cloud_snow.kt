package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CloudSnow: ImageVector
    get() {
        if (_CloudSnow != null) return _CloudSnow!!
        
        _CloudSnow = ImageVector.Builder(
            name = "cloud-snow",
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
                moveTo(7f, 18f)
                arcToRelative(4.6f, 4.4f, 0f, false, true, 0f, -9f)
                arcToRelative(5f, 4.5f, 0f, false, true, 11f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 15f)
                verticalLineToRelative(0.01f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(0.01f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(0.01f)
                moveToRelative(4f, -4f)
                verticalLineToRelative(0.01f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(0.01f)
            }
        }.build()
        
        return _CloudSnow!!
    }

private var _CloudSnow: ImageVector? = null

