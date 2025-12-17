package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.UserCircle: ImageVector
    get() {
        if (_UserCircle != null) return _UserCircle!!
        
        _UserCircle = ImageVector.Builder(
            name = "user-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcTo(7f, 7f, 0f, true, true, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
                close()
                moveToRelative(-5f, -2f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
                moveTo(8f, 9f)
                curveToRelative(-1.825f, 0f, -3.422f, 0.977f, -4.295f, 2.437f)
                arcTo(5.49f, 5.49f, 0f, false, false, 8f, 13.5f)
                arcToRelative(5.49f, 5.49f, 0f, false, false, 4.294f, -2.063f)
                arcTo(4.997f, 4.997f, 0f, false, false, 8f, 9f)
                close()
            }
        }.build()
        
        return _UserCircle!!
    }

private var _UserCircle: ImageVector? = null

