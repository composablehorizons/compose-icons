package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Identification: ImageVector
    get() {
        if (_Identification != null) return _Identification!!
        
        _Identification = ImageVector.Builder(
            name = "identification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 6f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(4f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(6f)
                close()
                moveToRelative(4f, 1.5f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                close()
                moveToRelative(2f, 3f)
                arcToRelative(4f, 4f, 0f, false, false, -3.665f, 2.395f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.416f, 1f)
                arcTo(8.98f, 8.98f, 0f, false, false, 7f, 14.5f)
                arcToRelative(8.98f, 8.98f, 0f, false, false, 3.249f, -0.604f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.416f, -1.001f)
                arcTo(4.001f, 4.001f, 0f, false, false, 7f, 10.5f)
                close()
                moveToRelative(5f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(0f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(0.75f, -4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
            }
        }.build()
        
        return _Identification!!
    }

private var _Identification: ImageVector? = null

