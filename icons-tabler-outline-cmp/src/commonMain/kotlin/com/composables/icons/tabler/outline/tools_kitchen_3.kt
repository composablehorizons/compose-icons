package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ToolsKitchen3: ImageVector
    get() {
        if (_ToolsKitchen3 != null) return _ToolsKitchen3!!
        
        _ToolsKitchen3 = ImageVector.Builder(
            name = "tools-kitchen-3",
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
                moveTo(7f, 4f)
                verticalLineToRelative(17f)
                moveToRelative(-3f, -17f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                verticalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 8f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 4f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 4f, 0f, true, false, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 12f)
                verticalLineToRelative(9f)
            }
        }.build()
        
        return _ToolsKitchen3!!
    }

private var _ToolsKitchen3: ImageVector? = null

