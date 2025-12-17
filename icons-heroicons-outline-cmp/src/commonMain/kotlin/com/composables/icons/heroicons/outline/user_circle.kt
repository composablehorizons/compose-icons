package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.UserCircle: ImageVector
    get() {
        if (_UserCircle != null) return _UserCircle!!
        
        _UserCircle = ImageVector.Builder(
            name = "user-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(17.982f, 18.725f)
                arcTo(7.488f, 7.488f, 0f, false, false, 12f, 15.75f)
                arcToRelative(7.488f, 7.488f, 0f, false, false, -5.982f, 2.975f)
                moveToRelative(11.963f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -11.963f, 0f)
                moveToRelative(11.963f, 0f)
                arcTo(8.966f, 8.966f, 0f, false, true, 12f, 21f)
                arcToRelative(8.966f, 8.966f, 0f, false, true, -5.982f, -2.275f)
                moveTo(15f, 9.75f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
        }.build()
        
        return _UserCircle!!
    }

private var _UserCircle: ImageVector? = null

