package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BriefcaseMedical: ImageVector
    get() {
        if (_BriefcaseMedical != null) return _BriefcaseMedical!!
        
        _BriefcaseMedical = ImageVector.Builder(
            name = "briefcase-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 128f)
                horizontalLineToRelative(-80f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineTo(176f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(192f, 96f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(32f)
                horizontalLineTo(192f)
                verticalLineTo(96f)
                close()
                moveToRelative(160f, 248f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _BriefcaseMedical!!
    }

private var _BriefcaseMedical: ImageVector? = null

