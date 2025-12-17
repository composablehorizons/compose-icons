package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.OctagonPlus: ImageVector
    get() {
        if (_OctagonPlus != null) return _OctagonPlus!!
        
        _OctagonPlus = ImageVector.Builder(
            name = "octagon-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.196f, 1.246f)
                lineToRelative(5.575f, 2.39f)
                arcToRelative(3.04f, 3.04f, 0f, false, true, 1.595f, 1.594f)
                lineToRelative(2.388f, 5.573f)
                curveToRelative(0.328f, 0.764f, 0.328f, 1.63f, 0f, 2.393f)
                lineToRelative(-2.39f, 5.575f)
                arcToRelative(3.04f, 3.04f, 0f, false, true, -1.594f, 1.595f)
                lineToRelative(-5.573f, 2.388f)
                arcToRelative(3.03f, 3.03f, 0f, false, true, -2.393f, 0f)
                lineToRelative(-5.574f, -2.389f)
                arcToRelative(3.04f, 3.04f, 0f, false, true, -1.595f, -1.595f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(3.04f, 3.04f, 0f, false, true, 0f, -2.392f)
                lineToRelative(2.39f, -5.575f)
                arcToRelative(3.04f, 3.04f, 0f, false, true, 1.593f, -1.595f)
                lineToRelative(5.574f, -2.388f)
                arcToRelative(3.04f, 3.04f, 0f, false, true, 2.392f, 0f)
                moveToRelative(-1.196f, 6.754f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _OctagonPlus!!
    }

private var _OctagonPlus: ImageVector? = null

