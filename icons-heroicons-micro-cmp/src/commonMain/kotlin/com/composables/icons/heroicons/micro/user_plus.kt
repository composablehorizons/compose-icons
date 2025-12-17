package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) return _UserPlus!!
        
        _UserPlus = ImageVector.Builder(
            name = "user-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                close()
                moveTo(10f, 13f)
                curveToRelative(0.552f, 0f, 1.01f, -0.452f, 0.9f, -0.994f)
                arcToRelative(5.002f, 5.002f, 0f, false, false, -9.802f, 0f)
                curveToRelative(-0.109f, 0.542f, 0.35f, 0.994f, 0.902f, 0.994f)
                horizontalLineToRelative(8f)
                close()
                moveTo(12.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _UserPlus!!
    }

private var _UserPlus: ImageVector? = null

