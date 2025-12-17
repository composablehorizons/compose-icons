package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ServerStack: ImageVector
    get() {
        if (_ServerStack != null) return _ServerStack!!
        
        _ServerStack = ImageVector.Builder(
            name = "server-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(5.25f, 14.25f)
                horizontalLineToRelative(13.5f)
                moveToRelative(-13.5f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                moveToRelative(3f, 3f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                moveToRelative(-16.5f, -3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                moveToRelative(-19.5f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 0.9f, -2.7f)
                lineTo(5.737f, 5.1f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, 2.7f, -1.35f)
                horizontalLineToRelative(7.126f)
                curveToRelative(1.062f, 0f, 2.062f, 0.5f, 2.7f, 1.35f)
                lineToRelative(2.587f, 3.45f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 0.9f, 2.7f)
                moveToRelative(0f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                moveToRelative(0f, 3f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(-3f, 6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _ServerStack!!
    }

private var _ServerStack: ImageVector? = null

