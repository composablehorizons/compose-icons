package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ToolsKitchen2: ImageVector
    get() {
        if (_ToolsKitchen2 != null) return _ToolsKitchen2!!
        
        _ToolsKitchen2 = ImageVector.Builder(
            name = "tools-kitchen-2",
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
                moveTo(19f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.023f, -3.681f, 0.184f, -7.406f, 5f, -12f)
                close()
                moveToRelative(0f, 12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                moveToRelative(-10f, -14f)
                verticalLineToRelative(17f)
                moveToRelative(-3f, -17f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                verticalLineToRelative(-3f)
            }
        }.build()
        
        return _ToolsKitchen2!!
    }

private var _ToolsKitchen2: ImageVector? = null

