package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EditCircle: ImageVector
    get() {
        if (_EditCircle != null) return _EditCircle!!
        
        _EditCircle = ImageVector.Builder(
            name = "edit-circle",
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
                moveTo(12f, 15f)
                lineToRelative(8.385f, -8.415f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -2.97f, -2.97f)
                lineToRelative(-8.415f, 8.385f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 5f)
                lineToRelative(3f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7.07f)
                arcToRelative(7f, 7f, 0f, false, false, 1f, 13.93f)
                arcToRelative(7f, 7f, 0f, false, false, 6.929f, -6f)
            }
        }.build()
        
        return _EditCircle!!
    }

private var _EditCircle: ImageVector? = null

