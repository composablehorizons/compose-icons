package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Call_split: ImageVector
    get() {
        if (_Call_split != null) return _Call_split!!
        
        _Call_split = ImageVector.Builder(
            name = "call_split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-2.88f, 2.88f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(2.88f, -2.88f)
                lineTo(20f, 10f)
                verticalLineTo(4f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(4.71f, 4.7f)
                verticalLineTo(20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.41f)
                lineToRelative(-5.29f, -5.3f)
                lineTo(10f, 4f)
                close()
            }
        }.build()
        
        return _Call_split!!
    }

private var _Call_split: ImageVector? = null

