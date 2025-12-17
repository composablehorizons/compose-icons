package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.LifePreserver: ImageVector
    get() {
        if (_LifePreserver != null) return _LifePreserver!!
        
        _LifePreserver = ImageVector.Builder(
            name = "life-preserver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveToRelative(6.43f, -5.228f)
                arcToRelative(7.03f, 7.03f, 0f, false, true, -3.658f, 3.658f)
                lineToRelative(-1.115f, -2.788f)
                arcToRelative(4f, 4f, 0f, false, false, 1.985f, -1.985f)
                close()
                moveTo(5.228f, 14.43f)
                arcToRelative(7.03f, 7.03f, 0f, false, true, -3.658f, -3.658f)
                lineToRelative(2.788f, -1.115f)
                arcToRelative(4f, 4f, 0f, false, false, 1.985f, 1.985f)
                close()
                moveToRelative(9.202f, -9.202f)
                lineToRelative(-2.788f, 1.115f)
                arcToRelative(4f, 4f, 0f, false, false, -1.985f, -1.985f)
                lineToRelative(1.115f, -2.788f)
                arcToRelative(7.03f, 7.03f, 0f, false, true, 3.658f, 3.658f)
                moveToRelative(-8.087f, -0.87f)
                arcToRelative(4f, 4f, 0f, false, false, -1.985f, 1.985f)
                lineTo(1.57f, 5.228f)
                arcTo(7.03f, 7.03f, 0f, false, true, 5.228f, 1.57f)
                close()
                moveTo(8f, 11f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
            }
        }.build()
        
        return _LifePreserver!!
    }

private var _LifePreserver: ImageVector? = null

