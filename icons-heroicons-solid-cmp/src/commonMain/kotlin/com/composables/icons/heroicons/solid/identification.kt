package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Identification: ImageVector
    get() {
        if (_Identification != null) return _Identification!!
        
        _Identification = ImageVector.Builder(
            name = "identification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 3.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(6.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-15f)
                close()
                moveToRelative(4.125f, 3f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0f, -4.5f)
                close()
                moveToRelative(-3.873f, 8.703f)
                arcToRelative(4.126f, 4.126f, 0f, false, true, 7.746f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.351f, 0.92f)
                arcToRelative(7.47f, 7.47f, 0f, false, true, -3.522f, 0.877f)
                arcToRelative(7.47f, 7.47f, 0f, false, true, -3.522f, -0.877f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.351f, -0.92f)
                close()
                moveTo(15f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(15f)
                close()
                moveTo(14.25f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(0.75f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        
        return _Identification!!
    }

private var _Identification: ImageVector? = null

