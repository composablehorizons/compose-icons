package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CapsuleHorizontal: ImageVector
    get() {
        if (_CapsuleHorizontal != null) return _CapsuleHorizontal!!
        
        _CapsuleHorizontal = ImageVector.Builder(
            name = "capsule-horizontal",
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
                moveTo(3f, 6f)
                moveToRelative(0f, 6f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(6f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(0f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineToRelative(-6f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                close()
            }
        }.build()
        
        return _CapsuleHorizontal!!
    }

private var _CapsuleHorizontal: ImageVector? = null

