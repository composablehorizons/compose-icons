package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Funnel: ImageVector
    get() {
        if (_Funnel != null) return _Funnel!!
        
        _Funnel = ImageVector.Builder(
            name = "funnel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.792f, 2.938f)
                arcTo(49.069f, 49.069f, 0f, false, true, 12f, 2.25f)
                curveToRelative(2.797f, 0f, 5.54f, 0.236f, 8.209f, 0.688f)
                arcToRelative(1.857f, 1.857f, 0f, false, true, 1.541f, 1.836f)
                verticalLineToRelative(1.044f)
                arcToRelative(3f, 3f, 0f, false, true, -0.879f, 2.121f)
                lineToRelative(-6.182f, 6.182f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.439f, 1.061f)
                verticalLineToRelative(2.927f)
                arcToRelative(3f, 3f, 0f, false, true, -1.658f, 2.684f)
                lineToRelative(-1.757f, 0.878f)
                arcTo(0.75f, 0.75f, 0f, false, true, 9.75f, 21f)
                verticalLineToRelative(-5.818f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(3.13f, 7.938f)
                arcToRelative(3f, 3f, 0f, false, true, -0.879f, -2.121f)
                verticalLineTo(4.774f)
                curveToRelative(0f, -0.897f, 0.64f, -1.683f, 1.542f, -1.836f)
                close()
            }
        }.build()
        
        return _Funnel!!
    }

private var _Funnel: ImageVector? = null

