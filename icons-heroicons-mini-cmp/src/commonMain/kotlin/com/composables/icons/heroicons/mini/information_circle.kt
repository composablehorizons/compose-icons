package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.InformationCircle: ImageVector
    get() {
        if (_InformationCircle != null) return _InformationCircle!!
        
        _InformationCircle = ImageVector.Builder(
            name = "information-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                close()
                moveToRelative(-7f, -4f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveTo(9f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.253f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.244f, 0.304f)
                lineToRelative(-0.459f, 2.066f)
                arcTo(1.75f, 1.75f, 0f, false, false, 10.747f, 15f)
                horizontalLineTo(11f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-0.253f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.244f, -0.304f)
                lineToRelative(0.459f, -2.066f)
                arcTo(1.75f, 1.75f, 0f, false, false, 9.253f, 9f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _InformationCircle!!
    }

private var _InformationCircle: ImageVector? = null

