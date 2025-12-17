package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Fire: ImageVector
    get() {
        if (_Fire != null) return _Fire!!
        
        _Fire = ImageVector.Builder(
            name = "fire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.963f, 2.286f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.071f, -0.136f)
                arcToRelative(9.742f, 9.742f, 0f, false, false, -3.539f, 6.176f)
                arcToRelative(7.547f, 7.547f, 0f, false, true, -1.705f, -1.715f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.152f, -0.082f)
                arcTo(9f, 9f, 0f, true, false, 15.68f, 4.534f)
                arcToRelative(7.46f, 7.46f, 0f, false, true, -2.717f, -2.248f)
                close()
                moveTo(15.75f, 14.25f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, -7.313f, -1.172f)
                curveToRelative(0.628f, 0.465f, 1.35f, 0.81f, 2.133f, 1f)
                arcToRelative(5.99f, 5.99f, 0f, false, true, 1.925f, -3.546f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.255f, 3.718f)
                close()
            }
        }.build()
        
        return _Fire!!
    }

private var _Fire: ImageVector? = null

